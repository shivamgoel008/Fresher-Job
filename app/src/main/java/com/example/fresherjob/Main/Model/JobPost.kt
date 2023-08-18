package com.example.fresherjob.Main.Model

data class JobPost(
    var jobDetails:String?=null,
    var jobLocation:String?=null,
    var jobSalary:String?=null,
    var jobSkills:Array<String>?=null,
    var jobStatus:Boolean,
    var jobTitle:String
)
