package com.github.koali1015.intellijplatformexample.services

import com.intellij.openapi.project.Project
import com.github.koali1015.intellijplatformexample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
