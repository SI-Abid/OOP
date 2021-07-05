#include<stdio.h>
struct Solid
{
    int height, width, depth;

    int getVolume()
    {
        return height*width*depth;
    }
};

int main()
{
    Solid box;
    box.height=10;
    box.width=8;
    box.depth=5;
    int vol = box.getVolume();
    printf("Volume = %d\n",vol);
}