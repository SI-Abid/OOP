#include<bits/stdc++.h>
using namespace std;

namespace Test
{
    ostream& operator<<(ostream& out, const vector<int>& v)
    {
        for (auto i : v)
            out << i << ' ';
        return out;
    }
} // namespace Test
using namespace Test;

struct Workshop{
    int start_time;
    int duration;
    int end_time;
};

struct Available_Workshops{
    int n;
    Workshop* workshops;
};

Available_Workshops* initialize(int start_time[], int duration[], int n){
    Available_Workshops* aw = new Available_Workshops;
    aw->n = n;
    aw->workshops = new Workshop[n];
    for(int i = 0; i < n; i++){
        aw->workshops[i].start_time = start_time[i];
        aw->workshops[i].duration = duration[i];
        aw->workshops[i].end_time = start_time[i] + duration[i];
    }
    return aw;
}

int CalculateMaxWorkshops(Available_Workshops* ptr){
    sort(ptr->workshops, ptr->workshops + ptr->n, [](Workshop a, Workshop b){
        return a.end_time < b.end_time;
    });
    int count = 1;
    int end_time = ptr->workshops[0].end_time;
    for(int i = 1; i < ptr->n; i++){
        if(ptr->workshops[i].start_time >= end_time){
            count++;
            end_time = ptr->workshops[i].end_time;
        }
    }
    return count;
}

int main()
{
    int n; // number of workshops
    cin >> n;
    // create arrays of unknown size n
    int* start_time = new int[n];
    int* duration = new int[n];
    for(int i = 0; i < n; i++){
        cin >> start_time[i];
    }
    for(int i = 0; i < n; i++){
        cin >> duration[i];
    }
    Available_Workshops * ptr;
    ptr = initialize(start_time,duration,n);
    cout << CalculateMaxWorkshops(ptr) << endl;
    return 0;
}