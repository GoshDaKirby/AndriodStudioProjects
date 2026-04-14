# Android Mobile Development — COMP 322 Labs
**A progressive series of 9 Android applications built with Kotlin, Java, and Jetpack Compose — covering the full arc of modern Android development from Kotlin fundamentals through REST APIs and local Room databases.**

---

## Overview

This repository contains all lab projects from COMP 322: Mobile Application Development at Olivet Nazarene University. Each lab builds directly on the last — starting with basic Kotlin syntax and ending with a multi-screen Android app that fetches live data from a REST API and stores it locally in a Room database.

All projects are solo work, written in Kotlin and Java using Android Studio with Jetpack Compose for UI.

---

## Lab Progression

### Lab 1 — Introduction to Kotlin
**Language:** Kotlin | **Tools:** Kotlin Playground / IntelliJ

Introduction to Kotlin fundamentals: functions, data types, data structures, and conditional logic. Builds a program that randomly selects and prints a Bible verse from a hardcoded list each time it runs.

**Concepts:** Functions, arrays, random selection, string formatting

---

### Lab 2 — Kotlin Classes & OOP
**Language:** Kotlin | **Tools:** IntelliJ

Extends Lab 1 using object-oriented programming. Introduces two custom classes — `BibleVerse` (with encapsulated fields and custom getters/setters enforcing data integrity) and `VerseOfTheDay` (which holds an array of `BibleVerse` objects and exposes methods for random and full-list display).

**Concepts:** Classes, encapsulation, custom accessors, UML design, for-each loops, string interpolation

---

### Lab 3 — Android Studio & Jetpack Compose
**Language:** Kotlin | **Tools:** Android Studio, Jetpack Compose

First Android app. Ports the `BibleVerse` and `VerseOfTheDay` classes into a Jetpack Compose Android project. Displays a single randomly selected Bible verse (book, chapter, verse, and text) as formatted text on launch.

**Concepts:** Android project structure, Composable functions, `@Preview`, `setContent`, emulator testing

---

### Lab 4 — User Interaction with Jetpack Compose
**Language:** Kotlin | **Tools:** Android Studio, Jetpack Compose

Builds on Lab 3 by adding a text field and button. User enters their name; on button press the app displays a personalized greeting with a random verse, where the greeting adapts to the current system time (Good morning / afternoon / evening).

**Concepts:** `TextField`, `Button`, state in Compose, system time querying, `SimpleDateFormat`, string interpolation

---

### Lab 5 — Jetpack Compose ViewModel
**Language:** Kotlin | **Tools:** Android Studio, Jetpack Compose, ViewModel

Refactors Lab 4 to use a `ViewModel` for state management. The composables no longer access data classes directly — all business logic moves into the ViewModel, making state survive configuration changes (e.g. screen rotation).

**Concepts:** MVVM architecture, `ViewModel`, state hoisting, separation of concerns, configuration change survival

---

### Lab 6 — Jetpack Compose Navigation
**Language:** Kotlin | **Tools:** Android Studio, Jetpack Compose Navigation

Extends Lab 5 with multi-screen navigation. Adds a second screen that lists all Bible verses with their book, chapter, and verse references. Navigation between screens handled by Jetpack Compose Navigation.

**Concepts:** `NavController`, `NavHost`, `composable()` destinations, multi-screen architecture

---

### Lab 7 — Navigation with Parameter Passing
**Language:** Kotlin | **Tools:** Android Studio, Jetpack Compose Navigation

Extends Lab 6 so the personalized greeting and verse display on a dedicated screen rather than the main screen. The user's entered name is passed as a navigation parameter to the greeting screen.

**Concepts:** Navigation arguments, route parameter passing, screen-to-screen data flow

---

### Lab 8 — REST API with Retrofit
**Language:** Kotlin | **Tools:** Android Studio, Retrofit, Firebase REST API

Replaces the hardcoded verse data with live data fetched from a Firebase REST API in JSON format using Retrofit. All other functionality from Lab 7 is preserved. Introduces HTTP networking, JSON deserialization, and asynchronous data loading in Android.

**Concepts:** Retrofit, REST APIs, JSON parsing, coroutines/async, Firebase Realtime Database, network permissions

---

### Lab 9 — Local Room Database
**Language:** Kotlin | **Tools:** Android Studio, Room Persistence Library

Replaces the hardcoded verse data with data stored and retrieved from a local Room database (SQLite abstraction). All other functionality from Lab 7 is preserved. Introduces local data persistence in Android.

**Concepts:** Room database, `@Entity`, `@Dao`, `@Database`, repository pattern, local persistence

---

## Tech Stack

| Technology | Used In |
|---|---|
| Kotlin | Labs 1–9 |
| Java | Supporting utilities |
| Android Studio | Labs 3–9 |
| Jetpack Compose | Labs 3–9 |
| ViewModel (MVVM) | Labs 5–9 |
| Jetpack Navigation | Labs 6–9 |
| Retrofit | Lab 8 |
| Room Database | Lab 9 |
| Firebase REST API | Lab 8 |

---

## Architecture Evolution

```
Lab 1–2:  Kotlin fundamentals → OOP
Lab 3–4:  Android UI → Composables → User input
Lab 5:    MVVM → ViewModel state management
Lab 6–7:  Multi-screen → Navigation → Parameter passing
Lab 8:    Network layer → REST API → Retrofit
Lab 9:    Persistence layer → Room → Local database
```

Each layer maps to a real component of production Android architecture. By Lab 9, the app follows a proper separation of concerns across UI, ViewModel, Repository, and Data layers.

---

## Author

**Joshua Easo** — B.S. Computer Science, Olivet Nazarene University (Dec 2025)

[LinkedIn](https://www.linkedin.com/in/joshua-easo-81b1a7196) · [GitHub](https://github.com/GoshDaKirby) · [Portfolio](https://GoshDaKirby.github.io/portfolio)
