#include <detpic32.h>

void setPWN(unsigned int dutyCycle){
    OC1RS = ((PR3+1)*dutyCycle)/100;
}

int main(void){
        T3CONbits.TCKPS = 2; // 1:32 prescaler (i.e Fout_presc = 625 KHz)
        PR3 = 49999; // Fout = 20MHz / (32 * (62499 + 1)) = 10 Hz
        TMR3 = 0; // Reset timer T2 count register
        T3CONbits.TON = 1; // Enable timer T2 (must be the last command of the
                            // timer configuration sequence)
        OC1CONbits.OCM = 6; // PWM mode on OCx; fault pin disabled
        OC1CONbits.OCTSEL =1;// Use timer T2 as the time base for PWM generation
        OC1RS = 12500; // Ton constant
        OC1CONbits.ON = 1; // Enable OC1 module

        setPWN(50);

        TRISCbits.TRISC14 = 0;

        while(1){
            LATCbits.LATC14 = PORTDbits.RD0;
        }
    return 0;
}
