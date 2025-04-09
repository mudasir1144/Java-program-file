# **Campus Management System**  

A **Java-based University Management System** demonstrating **Object-Oriented Programming (OOP)** concepts like inheritance, encapsulation, and composition.  

---

## **📌 Features**  
✔ **University Structure**: Manage universities, departments, courses, and modules.  
✔ **People Management**: Track students, lecturers, and their details.  
✔ **Address Handling**: Store location data for universities and individuals.  
✔ **Clean OOP Design**: Follows best practices with proper class relationships.  

---

## **🛠️ Classes & Structure**  

| Class | Description |
|-------|-------------|
| `University` | Represents a university with name and address. |
| `Course` | Stores course details (name, department, duration). |
| `Module` | Manages subject modules (name, venue, schedule). |
| `Lecturer` (extends `Person`) | Handles lecturer-specific data (employee ID, salary). |
| `Student` (extends `Person`) | Tracks student info (student number, marketing preference). |
| `Address` | Stores address details (street, city, country). |
| `Person` (Base Class) | Contains common attributes (name, age, gender). |

---

## **🚀 How to Run**  
1. Clone the repo:  
   ```bash
   git clone https://github.com/mudasir1144/Java-program-file.git
   ```
2. Compile & execute `Main.java`:  
   ```bash
   javac Main.java
   java Main
   ```

---

## **🔧 OOP Concepts Used**  
✅ **Inheritance**: `Student` and `Lecturer` extend `Person`.  
✅ **Encapsulation**: Private fields with getters/setters.  
✅ **Composition**: `University` contains an `Address`.  
✅ **Association**: `Course` links to `Lecturer` and `Student[]`.  

---

## **📝 Example Output**  
```plaintext
University: Minhaj University  
Location: Lahore  

Course: Mobile App Development  
Lecturer: Hasham Haider  
Students:  
- Mudassir (001)
-Hamid (003)
Module: Java Programming  
Day: Tuesday, Time: 10.30 AM  
```

---

## **📂 Project Structure**  
```
/src  
├── Main.java            # Entry point  
├── University.java      # University class  
├── Course.java          # Course management  
├── Module.java          # Module details  
├── Lecturer.java        # Lecturer data  
├── Student.java         # Student info  
├── Person.java          # Base class  
└── Address.java         # Address handling  
```

---

## **💡 Future Improvements**  
🔹 Use **`ArrayList`** instead of arrays for dynamic resizing.  
🔹 Add **input validation** (e.g., age > 0).  
🔹 Implement **file persistence** (save/load data).  

--- 

**🌟 Star the repo if you find it useful!**  
**🔗 GitHub:** [https://github.com/mudasir1144Java-program-file](https://github.com/mudasir1144/Java-program-file)  

---
