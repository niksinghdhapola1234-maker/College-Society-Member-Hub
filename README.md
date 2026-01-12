# College Society Member Hub 📱

An Android application designed to help manage college society members and announcements efficiently.  
This project is built using **Kotlin**, **Jetpack Compose**, and follows the **MVVM architecture** with **Room Database** for local data storage.

---

## 🚀 Features

### 👤 Member Management
- Add new society members
- View list of members
- Edit member details
- Delete members

### 📢 Announcements
- Create announcements
- View announcements in a clean UI
- Store announcements locally using Room

### 🔐 Role-Based Flow
- Admin dashboard for managing members and announcements
- Member dashboard for viewing information

---

## 🛠️ Tech Stack

- **Language:** Kotlin  
- **UI:** Jetpack Compose  
- **Architecture:** MVVM (Model–View–ViewModel)  
- **Database:** Room  
- **State Management:** LiveData  
- **Build System:** Gradle (KTS)  

---

## 📂 Project Structure
College-Society-Member-Hub/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/societymemberhub/
│           │       ├── ui/
│           │       │   ├── FirstScreen.kt
│           │       │   ├── AdminDashboard.kt
│           │       │   ├── MemberDashboard.kt
│           │       │   ├── MemberList.kt
│           │       │   ├── MemberCard.kt
│           │       │   ├── AddMemberScreen.kt
│           │       │   ├── EditMemberScreen.kt
│           │       │   ├── AnnouncementScreen.kt
│           │       │   ├── AddAnnouncementScreen.kt
│           │       │   └── AnnouncementCard.kt
│           │       │
│           │       ├── data/
│           │       │   ├── Member.kt
│           │       │   ├── Announcement.kt
│           │       │   ├── MemberDao.kt
│           │       │   ├── AnnouncementDao.kt
│           │       │   └── AppDatabase.kt
│           │       │
│           │       ├── repository/
│           │       │   ├── MemberRepository.kt
│           │       │   └── AnnouncementRepository.kt
│           │       │
│           │       ├── viewmodel/
│           │       │   ├── AppViewModel.kt
│           │       │   └── AppViewModelFactory.kt
│           │       │
│           │       └── MainActivity.kt
│           │
│           ├── res/
│           └── AndroidManifest.xml
│
├── gradle/
├── .gitignore
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
└── README.md



---

## 🧠 Architecture Overview (MVVM)

### 🔹 Model
- Room entities (`Member`, `Announcement`)
- DAO interfaces for database operations
- Local SQLite database via Room

### 🔹 View
- UI built using Jetpack Compose
- Screens and components (`MemberList`, `AnnouncementScreen`, etc.)

### 🔹 ViewModel
- `AppViewModel` handles all business logic
- Exposes LiveData to UI
- Communicates with Repository layer

### 🔹 Repository
- Acts as a bridge between ViewModel and Room database
- Ensures clean separation of concerns

---

## ▶️ How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/niksinghdhapola1234-maker/College-Society-Member-Hub.git
Open the project in Android Studio

Allow Gradle to sync completely

Run the app on:

Android Emulator OR

Physical Android device

🎓 Academic Purpose

This project was developed as part of a college academic requirement to demonstrate:

Android app development skills

Usage of Kotlin and Jetpack Compose

MVVM architectural understanding

Room database implementation

Clean code and modular structure

🚧 Limitations

No authentication system (admin login is role-based only)

Uses local database (no cloud sync)

Basic UI without animations

🔮 Future Improvements

Firebase authentication

Cloud database integration

Search & filter members

Better UI/UX with animations

Export member data to PDF/Excel

👨‍💻 Author

Nikhil Dhapola
Android Developer (Student)

GitHub: https://github.com/niksinghdhapola1234-maker
