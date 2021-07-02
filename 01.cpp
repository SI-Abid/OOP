#include "iostream"
using namespace std;
#include "string"

class Employee
{
public:
    int salary, workHour;

    Employee();
    ~Employee();
    void getInfo(int salary, int workHour)
    {
        this->salary = salary;
        this->workHour = workHour;
    }
    void addSal()
    {
        if (salary < 500)
            salary += 10;
    }
    void addWork()
    {
        if (workHour > 100)
        {
            salary *= 2;
            workHour = 6;
        }
        else if (workHour > 6)
            salary += 5;
        workHour++;
    }
};

Employee::Employee()
{
    salary = workHour = 0;
}

Employee::~Employee()
{
}

int main()
{
    Employee tousif, abid, mohsin, rahat;
    tousif.getInfo(400, 6);
    abid.getInfo(500, 3);
    mohsin.getInfo(500, 5);
    rahat.getInfo(300, 7);
    cout << "---- Starting salary and Work hour per day ----" << endl;
    cout << "Tousif: " << tousif.salary << " " << tousif.workHour << endl;
    cout << "Abid: " << abid.salary << " " << abid.workHour << endl;
    cout << "Mohsin: " << mohsin.salary << " " << mohsin.workHour << endl;
    cout << "Rahat: " << rahat.salary << " " << rahat.workHour << endl;
    for (int i = 0; i < 120; i++)
    {
        tousif.addSal();
        tousif.addWork();
        abid.addSal();
        abid.addWork();
        mohsin.addSal();
        mohsin.addWork();
        rahat.addSal();
        rahat.addWork();
    }
    cout << "---- Salary after 10 year ----" << endl;
    cout << "Tousif: " << tousif.salary << endl;
    cout << "Abid: " << abid.salary << endl;
    cout << "Mohsin: " << mohsin.salary << endl;
    cout << "Rahat: " << rahat.salary << endl;
    return 0;
}