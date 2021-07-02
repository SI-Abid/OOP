#include <iostream>
#include <string>
using namespace std;
class Student
{
private:
    string name, id;
    int batch;
    void reset()
    {
        name.clear();
        id.clear();
        batch=0;
    }
public:
    Student(string, string, int);
    ~Student();
    string getName()
    {
        return name;
    }
    void printIdBatch()
    {
        cout<<id<<endl<<batch<<endl;
    }
};

Student :: Student(string name, string id, int batch)
{
    this->name=name;
    this->id=id;
    this->batch=batch;
}
Student :: ~Student()
{

}

int main()
{
    string name, id;
    int batch;
    getline(cin, name);
    cin>>id>>batch;
    Student user(name,id,batch);
    cout << user.getName() << endl;
    user.printIdBatch();
    
    return 0;
}