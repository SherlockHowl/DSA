#include <iostream>

void solve()
{
    std::cout<<"Hello world"<<std::endl;
}

int main()
{
    #ifndef ONLINE_JUDGE
    freopen("output.txt", "w", stdout);
    freopen("input.txt", "r", stdin);
    #endif
    
    int t;
    std::cin>>t;

    while(t--)
    {
        solve();
    }
    return 0;
}