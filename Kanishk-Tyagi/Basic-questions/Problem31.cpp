// WAP to check whether a number is perfect or not.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    bool isPerfectNumber(int n){
        if(n<=1){
            return false;
        }
        int sum = 1;
        for (int i = 2; i * i <= n;i++){
           if(n%i==0){
               sum += i;
               if(i != n/i){
                   sum += n / i;
               }
           }
        }
        return sum == n;
    }
};
int main(){
    int num;
    cin >> num;
    solution sol;
    if(sol.isPerfectNumber(num)){
        cout << "Perfect Number";
    }
    else{
        cout << "not a perfect number";
    }
    return 0;
}