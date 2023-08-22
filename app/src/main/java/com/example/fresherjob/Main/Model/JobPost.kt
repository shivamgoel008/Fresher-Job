package com.example.fresherjob.Main.Model

data class JobPost(
    var jobDetails:String?="",
    var jobLocation:String?="",
    var jobSalary:String?="",
    var jobSkills:Array<String>?=null,
    var jobStatus:Boolean?=true,
    var jobTitle:String?="",
    var jobCompany:String?="",
    var jobExperience:String?=""
)
