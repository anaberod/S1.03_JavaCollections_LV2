# 📄 Description - Exercise Statement

Create a class called `Restaurant` with two attributes: `name` (String) and `rating` (int).  
Implement the necessary methods so that two `Restaurant` objects with the same name and the same rating cannot be inserted into a `HashSet` created in the `main()` method.

Restaurants with the same name but different ratings are allowed, but two restaurants with the same name and the same rating must not coexist in the `HashSet`.

# 💻 Technologies Used

Java 17  
IntelliJ IDEA

# 📋 Requirements

Java Development Kit (JDK) 17 or higher  
IntelliJ IDEA or another compatible Java IDE

# 🛠️ Installation

Clone the repository:

```bash
git clone https://github.com/anaberod/S1.03_JavaCollections_LV2.git
```

Navigate to the project directory:

```bash
cd Restaurant-HashSet
```

Open the project in IntelliJ IDEA.  
Build the project if necessary.

# ▶️ Execution

Open the project in IntelliJ IDEA.  
Locate the `Main` class containing the `main` method.  
Run the `Main` class.  
The application will add `Restaurant` objects into a `HashSet`.  
Restaurants with the same name and rating will not be inserted multiple times.

# 🌐 Deployment

No deployment is necessary for this educational exercise.  
Optionally, you can package it as a `.jar` file using Maven:

```bash
mvn package
```

# 🤝 Contributions

Fork the repository.  
Create a new branch:

```bash
git checkout -b feature/NewFeature
```

Make your changes and commit them:

```bash
git commit -m "Add New Feature"
```

Push your changes:

```bash
git push origin feature/NewFeature
```

Open a pull request.
