package com.dicoding.mysubmission

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnItemClickCallback {
    private lateinit var rvCampus: RecyclerView
    private val list = ArrayList<Campus>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvCampus = findViewById(R.id.rv_list)
        rvCampus.setHasFixedSize(true)

        list.addAll(getListCampus())
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_about -> {
                val about = Intent(this@MainActivity, about::class.java)
                startActivity(about)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
    private fun getListCampus(): ArrayList<Campus> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto =  resources.obtainTypedArray(R.array.data_photo)
        val listCampus = ArrayList<Campus>()
        for (i in dataName.indices) {
            val activityClass = when (dataName[i]) {
                "Institut Teknologi Bandung" -> itb::class.java
                "Institut Teknologi Nasional" -> itenas::class.java
                "Universitas Kristen Maranatha" -> ukm::class.java
                "UIN Sunan Gunung Djati" -> uin::class.java
                "Telkom University" -> telkom::class.java
                "Universitas Komputer Indonesia" -> unikom::class.java
                "Universitas Padjajaran" -> unpad::class.java
                "Universitas Katolik Parahyangan" -> ukp::class.java
                "Universitas Pasundan" -> unpas::class.java
                "Universitas Pendidikan Indonesia" -> upi::class.java
                else -> MainActivity::class.java
            }
            val campus = Campus(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1), activityClass)
            listCampus.add(campus)
        }
        return listCampus
    }

    private fun showRecyclerList() {
        rvCampus.layoutManager = LinearLayoutManager(this)
        val listCampusAdapter = ListCampusAdapter(list)
        rvCampus.adapter = listCampusAdapter

        listCampusAdapter.setOnItemClickCallback(this)
    }

    override fun onItemClicked(data: Campus) {
        val intent = Intent(this@MainActivity, data.activityClass)
        startActivity(intent)
    }
}