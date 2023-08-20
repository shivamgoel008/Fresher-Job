package com.example.fresherjob.Main.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.fresherjob.Main.Model.JobPost
import com.example.fresherjob.R
import org.w3c.dom.Text
import java.util.ArrayList

class JobPostsAdapter(private val jobPosts: ArrayList<JobPost>): RecyclerView.Adapter<JobPostsAdapter.JobPostsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int):JobPostsViewHolder{
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.job_post_item,parent,false)
        return JobPostsViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return jobPosts.size;
    }

    override fun onBindViewHolder(holder: JobPostsViewHolder, position: Int) {
        var currentItem=jobPosts[position];
        holder.jobTitle.text=currentItem.jobTitle
        holder.companyName.text=currentItem.jobCompany
        holder.experienceText.text=currentItem.jobExperience
        holder.salaryText.text=currentItem.jobSalary
        holder.locationName.text=currentItem.jobExperience
    }
    class JobPostsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val companyImage:ImageView=itemView.findViewById(R.id.companyImage);
        var jobTitle:TextView=itemView.findViewById(R.id.jobTitle);
        val companyName:TextView=itemView.findViewById(R.id.companyName);
        val salaryText:TextView=itemView.findViewById(R.id.salaryText);
        val experienceText:TextView=itemView.findViewById(R.id.experienceText);
        val locationName:TextView=itemView.findViewById(R.id.locationName);
    }
}