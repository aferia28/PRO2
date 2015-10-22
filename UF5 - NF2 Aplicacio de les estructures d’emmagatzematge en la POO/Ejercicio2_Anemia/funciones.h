/* 
 Edad y sexo       Nivel mínimo    Nivel máximo
 *                 Hemoglobina     Hemoglobina
                            
    1 año <=         11 %              15 %
>1 y <= 15 años      11.5%             15.5 %

 * Mujeres (m) > 15  12 %              16 %
años

Hombres (h) > 15     14%               18%
años 
 */

#include <stdio.h>

bool tienesAnemia(int edad, char sexo, float hemo, float *min, float *max)
{
    if(edad <= 1)
    {
        *min=11;
        *max=15;
    if(hemo<11 || hemo>15)
        return true;
    }
    else if(edad > 1 && edad <= 15)
    {
        *min=11.5;
        *max=15.5;
    if(hemo<11.5 || hemo>15)
        return true;
    }
    else if(edad>15 && sexo == "m")
    {
        *min=12;
        *max=16;
    if(hemo<12 || hemo>16)
        return true;
    }    
    else if(edad>15 && sexo == "h")
    {
        *min=14;
        *max=18;
        if(hemo<14 || hemo>18)
         return true;
    }
}