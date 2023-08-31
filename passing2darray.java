static void computeTranspose(int a[][],int m)
{
    int temp[][]=new int[m][a.length];
    for(int i=0;i<m;i++)
    {
        for(int j=0;i<a.length;j++)
        {
            temp[i][j]=a[j][i];
        }
    }
}

int a[][]={{2,3},
            {2,5},
            {2,8}};