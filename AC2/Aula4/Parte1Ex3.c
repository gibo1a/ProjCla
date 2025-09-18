#include <detpic32.h>

int main(void){
    TRISE = TRISE & 0xFF87;
    int counter = 10;
    while (1){
        LATE = (LATE & 0xFF87) | counter << 3;
        resetCoreTimer();
        while(readCoreTimer()<7407407);
        counter = (counter + 9) % 10;
    }
    return 0;
}
