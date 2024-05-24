#include <detpic32.h>

int main(void){
    T2CONbits.TCKPS = 2; // 1:32 prescaler (i.e Fout_presc = 625 KHz)
    PR2 = 33332; // Fout = 20MHz / (32 * (62499 + 1)) = 10 Hz
    TMR2 = 0; // Reset timer T2 count register
    T2CONbits.TON = 1; // Enable timer T2 (must be the last command of the
    // timer configuration sequence)
    OC2CONbits.OCM = 6; // PWM mode on OCx; fault pin disabled
    OC2CONbits.OCTSEL =0;// Use timer T2 as the time base for PWM generation
    OC2RS = 8333; // Ton constant
    OC2CONbits.ON = 1; // Enable OC1 module

    TRISBbits.TRISB3 = 1;
    TRISBbits.TRISB0 = 1;

    while(1){
        if((PORTBbits.RB0==1) & (PORTBbits.RB3==0)){
            OC2RS = 8333;
        }else if((PORTBbits.RB0 == 0) & (PORTBbits.RB3==1)){
            OC2RS = 23333;
        }else{
            OC2RS = OC2RS;
        }
        resetCoreTimer();
        while(readCoreTimer() < 5000);
    }
    return 0;
}
