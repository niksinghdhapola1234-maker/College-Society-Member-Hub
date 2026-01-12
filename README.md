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

```text
College-Society-Member-Hub/
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
│           │       ├── data/
│           │       │   ├── Member.kt
│           │       │   ├── Announcement.kt
│           │       │   ├── MemberDao.kt
│           │       │   ├── AnnouncementDao.kt
│           │       │   └── AppDatabase.kt
│           │       ├── repository/
│           │       │   ├── MemberRepository.kt
│           │       │   └── AnnouncementRepository.kt
│           │       ├── viewmodel/
│           │       │   ├── AppViewModel.kt
│           │       │   └── AppViewModelFactory.kt
│           │       └── MainActivity.kt
│           ├── res/
│           └── AndroidManifest.xml
├── gradle/
├── .gitignore
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
└── README.md


---

## 🧠 Architecture Overview (MVVM)

- **Model:** Room entities and database
- **View:** Jetpack Compose UI screens
- **ViewModel:** Handles business logic and exposes LiveData to UI
- **Repository:** Acts as a single source of truth for data

```

## ▶️ How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/niksinghdhapola1234-maker/College-Society-Member-Hub.git
2.Open the project in Android Studio

3.Let Gradle sync complete

4.Run the app on:

 Emulator or Physical Android device

🎓 Academic Purpose

This project was developed as a college-level Android application to demonstrate:

Android app development skills

MVVM architecture understanding

Kotlin + Jetpack Compose usage

Local database integration using Room

📌 Future Improvements

Authentication (Admin login)

Cloud database integration (Firebase)

Search and filter members

Improved UI animations

Export member data

👨‍💻 Author

Nikhil Dhapola
Android Developer (Student)

GitHub: niksinghdhapola1234-maker

