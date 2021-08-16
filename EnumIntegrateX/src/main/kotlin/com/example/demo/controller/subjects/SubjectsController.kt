package com.example.demo.controller.subjects

import com.example.demo.model.Subject
import com.example.demo.model.User
import tornadofx.*

class SubjectsController: Controller() {
    val subjectsList = mutableListOf(
        Subject("Creative Computing","CC", "cc-icon.png", "Wade Rodgers", 30, 45, 2000, 4),
        Subject("Interaction Design","ID", "id-icon.png", "Agatha Dickinson", 30, 45, 2000, 4),
        Subject("3D Design","3DD", "3dd-icon.png", "Lucy Livingston", 30, 45, 2000, 4),
        Subject("Illustration","IL", "il-icon.png", "Agatha Dickinson", 30, 45, 2000, 4),
        Subject("Motion Design","MD", "md-icon.png", "Agatha Dickinson", 30, 45, 2000, 4),
        Subject("Photography","PG", "pg-icon.png", "Lucy Livingston", 30, 45, 2000, 4),
    ).asObservable()
}   