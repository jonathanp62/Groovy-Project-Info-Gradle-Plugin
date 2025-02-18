package net.jmp.gradle.plugin.projectinfo

/*
 * (#)ProjectInfoPlugin.groovy  0.1.0   02/18/2025
 *
 * @author   Jonathan Parker
 *
 * MIT License
 *
 * Copyright (c) 2025 Jonathan M. Parker
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * The project info plugin class.
 *
 * @version 0.1.0
 * @since   0.1.0
 */
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
