package com.example.fresherjob.Main.JobListing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fresherjob.Main.Model.JobPost
import com.example.fresherjob.R
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class JobListActivity : AppCompatActivity() {
    private lateinit var dbref:DatabaseReference
    private lateinit var jobPostRecyclerView: RecyclerView
    private lateinit var jobPostsArrayList:ArrayList<JobPost>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_list)
        jobPostRecyclerView=findViewById(R.id.jobPostRecyclerView)
        jobPostRecyclerView.layoutManager=LinearLayoutManager(this)
        jobPostRecyclerView.setHasFixedSize(true)

        jobPostsArrayList= arrayListOf<JobPost>()
        getJobPostsData()
    }

    private fun getJobPostsData() {
        dbref=FirebaseDatabase.getInstance().getReference("JobPost")
    }
}