# Student Management System - Java OOP Lab

This repository contains a collection of Java programs developed to demonstrate core Object-Oriented Programming (OOP) concepts. Each program is designed around a **Student Management System** use case.

---

##  Programs & Concepts Covered

### 1. Constructors and the `this` Keyword
**Objective:** To demonstrate how objects are initialized and how naming conflicts are resolved.

* **Theory:** * **Constructor Overloading:** This allows a class to have multiple constructors with different parameters. It provides flexibility, allowing us to create a `Student` object with no data, or with specific data (Name and ID).
    * **The `this` Keyword:** In Java, `this` is a reference to the current object. We use it inside constructors when the parameter names match the instance variable names (e.g., `this.name = name`). This tells the compiler to assign the value to the class attribute, not the local variable.

---

### 2. Instance vs. Static Methods
**Objective:** To understand the difference between object-specific behavior and class-level behavior.

* **Theory:** * **Instance Methods:** These methods belong to an individual object. For example, `displayDetails()` prints the specific name and ID of one student. You must create an object using `new` to call these.
    * **Static Methods:** These are declared with the `static` keyword and belong to the class itself. They can be called without creating an object. In this project, we use a static method to manage the `University Name`, which is the same for every student.

---

### 3. Arrays of Objects
**Objective:** To manage multiple student records efficiently using data structures.

* **Theory:** * **Concept:** Instead of creating separate variables for every student, we create an **Array of Objects**. This creates a collection of references.
    * **Implementation:** We initialize the array and then instantiate each index (e.g., `students[0] = new Student(...)`).
    * **Operations:** We use a loop to iterate through the array to perform operations, such as filtering students based on their CGPA or searching for a specific record.

---

## 📄 Documentation
The official lab report in PDF format (`ID_SECTION.pdf`) is included in the root directory of this repository as per the assignment requirements.
