package model;

public class Complaint {
    private String name;
    private String department;
    private String category;
    private String description;

    // Constructors
    public Complaint() {
    }

    public Complaint(String name, String department, String category, String description) {
        this.name = name;
        this.department = department;
        this.category = category;
        this.description = description;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}