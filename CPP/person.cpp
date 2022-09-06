#include <bits/stdc++.h>
using namespace std;

class person
{
private:
    string name;

public:
    person(string name) : name(name) {}

    friend ostream &operator<<(ostream &out, const person &p)
    {
        out << p.name;
        return out;
    }
    bool operator==(const person &p)
    {
        return name == p.name;
    }
};

int main()
{
    person p1("John"), p2("Jane"), p3("Joe");
    vector<person> vp;
    vp.push_back(p1);
    vp.push_back(p2);
    vp.push_back(p3);
    auto it = find(vp.begin(), vp.end(), p2);
    if (it != vp.end())
        cout << "Found " << *it << endl;
    else
        cout << "Not found" << endl;
    return 0;
}