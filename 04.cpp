#include<bits/stdc++.h>
using namespace std;

class str : public string
{
public:
    str(const char* s) : string(s) {}

    void operator=(const char *s)
    {
        (*this)=s;
    }

    void replace(char old, char neu)
    {
        for (int i = 0; i < this->size(); i++)
        {
            if(this->at(i)==old)
            {
                (*this)[i]=neu;
            }
        }
    }
};

int main()
{
    str s = "saiham";
    cout << s.size() << endl;
    cout<<s<<endl;
    s.replace('a','o');
    cout<<s<<endl;
    cout<<s.max_size()<<endl;
    return 0;
}