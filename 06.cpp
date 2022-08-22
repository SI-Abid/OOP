#include<bits/stdc++.h>
using namespace std;

class AbstractEmployee
{
    virtual void askForPromotion()=0;
};

class Employee:AbstractEmployee
{
    private:
        int id;
        string name;
        int salary;
    public:
        Employee(int id, string name, int salary)
        {
            this->id = id;
            this->name = name;
            this->salary = salary;
        }
        void display()
        {
            cout << "ID: " << id << endl;
            cout << "Name: " << name << endl;
            cout << "Salary: " << salary << endl;
        }
        void askForPromotion()
        {
            if(salary > 10000)
            {
                cout << "Promoted to Manager" << endl;
            }
            else
            {
                cout << "Promoted to Employee" << endl;
            }
        }
        void setSalary(int salary)
        {
            this->salary = salary;
        }
        string getName()
        {
            return name;
        }
        int getSalary()
        {
            return salary;
        }
        int getId()
        {
            return id;
        }
        void setId(int id)
        {
            this->id = id;
        }
        void setName(string name)
        {
            this->name = name;
        }
};

class Developer:public Employee
{
    private:
        string department;
    public:
        Developer(int id, string name, int salary, string department):Employee(id, name, salary)
        {
            this->department = department;
        }
        void display()
        {
            cout << "ID: " << getId() << endl;
            cout << "Name: " << getName() << endl;
            cout << "Salary: " << getSalary() << endl;
            cout << "Department: " << department << endl;
        }
        void fixBug()
        {
            cout << getName() << " fixed a bug in " << department << endl;
        }
};

class Teacher:public Employee
{
    private:
        string subject;
    public:
        Teacher(int id, string name, int salary, string subject):Employee(id, name, salary)
        {
            this->subject = subject;
        }
        void display()
        {
            cout << "ID: " << getId() << endl;
            cout << "Name: " << getName() << endl;
            cout << "Salary: " << getSalary() << endl;
            cout << "Subject: " << subject << endl;
        }
        void teach()
        {
            cout << getName() << " taught " << subject << endl;
        }
};

int main()
{
    Teacher amir = Teacher(1, "Amir", 10000, "C++");
    amir.display();
    amir.teach();

    return 0;
}