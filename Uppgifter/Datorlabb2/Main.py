import numpy
import numpy as np
import matplotlib
from matplotlib import pyplot as plt

## 1. Primitivfunktion och integration av polynomer

## Test array som många av funktionerna bygger på
array = [5]

## appendar det största värdet delat på n+1
## Går sedan baklänges (för att undvika overwriting) och flyttar fram varje värde samt delar med n-1+1
## Tillslut sätter den sista första elementen till 0 eftersom den alltid går 'förlorad'
def primitiv(p_array):
    n = len(p_array)-1
    p_array.append(p_array[n]/(n+1))
    for i in range(0,n+1):
        p_array[n-i+1] = p_array[n-i]/(n-i+1)
    p_array[0] = 0
    return p_array

#print(primitiv(array))


## Nyttjar den förra funktionen och räknar summorna man får av att ta primitiva funktionen * graden a^i samt b^i
## subtraherar och returnar summan.
def integrera(p_array,a,b):
    F = primitiv(p_array)
    n = len(F)-1
    summa_a = 0
    summa_b = 0
    for i in range(n+1):
        summa_a += F[i] * (a ** i)
        summa_b += F[i] * (b ** i)
    return summa_a-summa_b

#print(integrera(array,2,0))






## 2. Riemannsummor & Trapezregeln

## Funktionen vi använder oss av
def f(x):
    return x**2

## h, x_grid & f_values är definierade per instruktion, sedan summerar vi f_values utan sista punkten.
## Returnerar summan * h efter hela summan är beräknad



def riemann(f,a,b,n):
    h = (b-a)/n
    x_grid = np.linspace(a,b,n+1)
    f_values = f(x_grid)

    summa = np.sum(f_values[:-1])

    return h * summa



## h , x_grid & f_values är definierade per instruktion, eftersom första och sista punkt är beräknade separate
## så bortser vi från dem när vi summerar. Sist multipliceras summan med bredden h.
def trapez(f, a, b, n):
    h = (b - a) / n
    x_grid = np.linspace(a, b, n+1)
    f_values = f(x_grid)

    summa = 0.5 * (f_values[0] + f_values[-1]) + np.sum(f_values[1:-1])

    return h * summa

Riemann = riemann(f,0,1,100)
Trapez = trapez(f,0,1,100)

#print(Riemann)
#print(Trapez)








## 3. Felanalys
n_values = [1, 2, 5, 10, 20, 50, 100]
I = integrera([0,0,1], 1, 0)

ER = []
ET = []

for n in n_values:
    Rn = riemann(f,0,1,n)
    Tn = trapez(f,0,1,n)
    ER.append(abs(Rn - I)/abs(I))
    ET.append(abs(Tn - I)/abs(I))

plt.plot(n_values, ER, 'o-', label='Riemannsumma')
plt.plot(n_values, ET, 's-', label='Trapezregeln')
plt.xlabel('n')
plt.ylabel('Relativt fel')
plt.title('Riemannsumma & Trapezregel')
plt.legend()
plt.grid(True)

#plt.show()









## 4. Gauss felfunktionen
# Förstår inte riktigt hur det är tänkt att man ska representera f''(x) eller hur man ska visa användningen av satsen

## För |f''(x)|
# f''(0) = 2 <--- störst alltså M = 2
# f''(1) = 0.736
# f''(2) = 0.128
M = 2
a = 0
b = 2
fel = 10**(-6)
## Eftersom h = (b-a)/n kan vi skriva om satsen och lösa ut n när vi söker satsen mindre än felet till n >= (satsen omskriven) * 1/10**(-6)
## Detta ger:
n_min = int(np.ceil(np.sqrt((b-a)**3 * M / (12*fel))))


def f(x):
    return np.exp(-x**2)


print("minst: " + str(n_min) + " n")
#print(trapez(f,a,b,n_min))
