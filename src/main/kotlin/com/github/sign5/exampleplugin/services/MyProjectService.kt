package com.github.sign5.exampleplugin.services

import com.intellij.openapi.project.Project
import com.github.sign5.exampleplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
