package net.jmp.gradle.plugin.projectinfo

import org.gradle.api.Plugin
import org.gradle.api.Project

class ProjectInfoPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.gradle.projectsEvaluated {
            println "The groupId is ${project.group}"
            println "The artifactId is ${project.name}"
            println "The version is ${project.version}"
            println "The description is ${project.description}"
            println "The Gradle version is ${project.gradle.gradleVersion}"
        }
    }
}
