#include <cmath>
#include <cstdio>
#include <iostream>
#include <algorithm>

static bool between(int s, int t, int x) {
    return x >= s && x <= t;
}

int main() {
    int s,t,a,b,m,n;
    std::cin >> s >> t
             >> a >> b
             >> m >> n;
    int acnt, ocnt, tmp;
    apple_cnt = orange_cnt = 0;

    while(m-- > 0) {
        std::cin >> tmp;
        apple_cnt += between(s,t,tmp+a);
    }
    while(n-- > 0) {
        std::cin >> tmp;
        orange_cnt += between(s,t,tmp+b);
    }
    std::cout << apple_cnt << "\n" << orange_cnt << "\n";
    return 0;
}
