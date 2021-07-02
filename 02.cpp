#include "iostream"
#include "vector"
#include "exception"
#include "utility"
using namespace std;

class Matrix
{
private:
    int row, col;
    vector<vector<int>> matrix;
public:
    Matrix(int, int);
    ~Matrix();
    void setIndex(int r, int c, int e)
    {
        matrix[r][c]=e;
    }
    int getCol()
    {
        return col;
    }
    int getRow()
    {
        return row;
    }
    pair<int, int> getDim()
    {
        return {row,col};
    }
    vector<vector<int>> getVector()
    {
        return matrix;
    }
    void operator=(Matrix a)
    {
        this->row=a.getRow();
        this->col=a.getCol();
        this->matrix=a.getVector();
    }
    Matrix operator+(Matrix n)
    {
        try
        {
            if(this->getDim()!=n.getDim())
            {
                throw "Both dimension doesn't match";
            }
            else
            {
                int rowsize=this->row, colsize=this->col;
                Matrix res(rowsize, colsize);
                for (int i = 0; i < rowsize; i++)
                {
                    for (int j = 0; j < colsize; j++)
                    {
                        res.setIndex(i, j, matrix[i][j]+n.getVector()[i][j]);
                    }
                }
                return res;
            }
        }
        catch(const char *err)
        {
            cout << err << endl;
        }
    }
};

Matrix::Matrix(int r, int c)
{
    this->row=r;
    this->col=c;
    matrix.resize(r,vector<int>(c,0));
}

Matrix::~Matrix()
{
    matrix.clear();
}

int main()
{
    Matrix A(2,2), B(2,2), C(2,2);
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            A.setIndex(i,j,i+j+1);
            B.setIndex(i,j,i+j+2);
        }
    }
    C=A+B;
    for(auto x:C.getVector())
    {
        for(auto y:x)
           cout<<y<<" | ";
        cout<<endl;
    }
    return 0;
}