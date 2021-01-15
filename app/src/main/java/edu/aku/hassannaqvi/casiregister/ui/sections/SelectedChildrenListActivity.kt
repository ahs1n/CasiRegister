package edu.aku.hassannaqvi.casiregister.ui.sections

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import com.kennyc.view.MultiStateView
import com.leinardi.android.speeddial.SpeedDialActionItem
import edu.aku.hassannaqvi.casiregister.R
import edu.aku.hassannaqvi.casiregister.base.repository.GeneralRepository
import edu.aku.hassannaqvi.casiregister.base.repository.ResponseStatus
import edu.aku.hassannaqvi.casiregister.base.viewmodel.SelectedChildrenListViewModel
import edu.aku.hassannaqvi.casiregister.core.MainApp
import edu.aku.hassannaqvi.casiregister.database.DatabaseHelper
import edu.aku.hassannaqvi.casiregister.databinding.ActivitySelectedChildrenListBinding
import edu.aku.hassannaqvi.casiregister.utils.WarningActivityInterface
import edu.aku.hassannaqvi.casiregister.utils.extension.gotoActivity
import edu.aku.hassannaqvi.casiregister.utils.extension.obtainViewModel
import edu.aku.hassannaqvi.casiregister.utils.openSectionEndingActivity
import edu.aku.hassannaqvi.casiregister.utils.openWarningActivity
import java.util.*

class SelectedChildrenListActivity : AppCompatActivity(), WarningActivityInterface {

    lateinit var adapter: SelectedChildListAdapter
    lateinit var bi: ActivitySelectedChildrenListBinding

    /*
    * Using old approach to visible viewmodel in all sub classes
    * Serial no increment on every new entry
    * */
    companion object {
        lateinit var viewModel: SelectedChildrenListViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bi = DataBindingUtil.setContentView(this, R.layout.activity_selected_children_list)
        viewModel = obtainViewModel(SelectedChildrenListViewModel::class.java, GeneralRepository(DatabaseHelper(this)))
        callingRecyclerView()

        /*
        * Nested Toolbar
        * */
        bi.toolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.black))
        bi.toolbarLayout.setExpandedTitleColor(ContextCompat.getColor(this, R.color.black_overlay))


        /*
        * Setting Floating button functionality
        * */
        val actionItems = mutableListOf<SpeedDialActionItem>(
                SpeedDialActionItem.Builder(R.id.fab_exit, R.drawable.ic_exit).setLabel("Force exit").create(),
                SpeedDialActionItem.Builder(R.id.fab_finish, R.drawable.ic_finish).setLabel("Finish").create()
        )
        bi.speedDial.addAllActionItems(actionItems)
        bi.speedDial.setOnActionSelectedListener { actionItem ->
            when (actionItem.id) {
                R.id.fab_finish -> {
                    if (false) {
                        Snackbar.make(findViewById(android.R.id.content), "Please add children's for proceeding to the next section", Snackbar.LENGTH_LONG)
                                .show()
                        return@setOnActionSelectedListener false
                    }
                    gotoActivity(Section03CSActivity::class.java)
//                    val flag = adapter.mList.find { item -> item.memFlag == 3 }
//                    finish()
//                    startActivity(Intent(this, EndingActivity::class.java).putExtra("complete", flag == null).putExtra(CONSTANTS.NOT_IN_HOME_END, flag != null))
//                    return@OnActionSelectedListener true // false will close it without animation
                }
                R.id.fab_exit -> {
                    openSectionEndingActivity()
                    return@setOnActionSelectedListener true // false will close it without animation
                }
            }
            false
        }


        /*
        * Fetch child list
        * */
        bi.multiStateView.viewState = MultiStateView.ViewState.EMPTY
        viewModel.childResponse.observe(this, {
            it?.let {
                when (it.status) {
                    ResponseStatus.SUCCESS -> {
                        adapter.childItems = it.data as ArrayList<ChildInformation>
                        bi.multiStateView.viewState = MultiStateView.ViewState.CONTENT
                    }
                    ResponseStatus.ERROR -> {
                        bi.multiStateView.viewState = MultiStateView.ViewState.EMPTY
                    }
                    ResponseStatus.LOADING -> {
                        bi.multiStateView.viewState = MultiStateView.ViewState.LOADING
                    }
                }
            }
        })

    }

    /*
    * Callback call after pressing Child item in recyclerview
    * */
    override fun callWarningActivity(item: Any?) {
        val information = item as ChildInformation

        MainApp.child = Child()

        gotoActivity(Section03CSActivity::class.java)
    }

    /*
    * Initialize recyclerView with onClickListener
    * */
    private fun callingRecyclerView() {
        adapter = SelectedChildListAdapter(object : SelectedChildListAdapter.OnItemClickListener {
            override fun onItemClick(item: ChildInformation, position: Int) {
                openWarningActivity(
                        title = "CONFIRMATION!",
                        message = "Are you sure, you want to edit ${item.cb02.toUpperCase(Locale.ENGLISH)} interview?",
                        data = item)
            }
        })
        bi.childList.adapter = adapter
    }

    /*
    * Get childList on resume event
    * */
    override fun onResume() {
        super.onResume()

        viewModel.getChildDataFromDB(MainApp.form.cluster, MainApp.form.hhno, MainApp.form.uid)
    }
}