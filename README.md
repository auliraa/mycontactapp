# 📱 MyContactApp - Local Data Storage (Room & Compose)

A simple Android-based contact management application created to fulfill the "Local Data Storage with SQLite & Room" practical assignment. This application demonstrates the implementation of **MVVM Architecture**, **Jetpack Compose**, and **Room Database** for persistent local data storage.

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=android&logoColor=white)

## ✨ Key Features
Aligned with the assignment requirements:
* **Contact Entry:** A form to add new contacts including Name, Phone Number, and Email.
* **Local Persistence:** Saves data permanently using **SQLite** via the **Room** persistence library.
* **Reactive UI:** Newly added data appears instantly in the list without restarting the app (leveraging Kotlin `Flow` & `StateFlow`).
* **Modern Design:** Polished user interface built with **Material Design 3** and `Scaffold`.

## 📸 Screenshots
Here is a preview of the application:

| Main Screen (List) | 
|:-------------------------:|
| <img width="593" height="1256" alt="ui_3" src="https://github.com/user-attachments/assets/45286a2e-0ba7-44ba-a2d4-991267c66d94" />


## 🛠️ Tech Stack & Architecture
This project is built using modern Android development standards:

* **Language:** Kotlin
* **UI Framework:** Jetpack Compose (Material3)
* **Database:** Room Database (Abstraction layer over SQLite)
* **Architecture Pattern:** MVVM (Model-View-ViewModel)
    * **Model:** `Entity` (Table definition), `DAO` (Data Access Object), `Repository` (Data source).
    * **View:** `ContactScreen` (UI Composable).
    * **ViewModel:** `ContactViewModel` (State holder & Logic).
* **Concurrency:** Kotlin Coroutines & Flow.

## 👥 Student Information
**Project by:**
* **Name:** AULIRA | AMELIA | ASTRID
* **Class:** PAB

---
*Built using Android Studio*
