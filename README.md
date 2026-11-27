Exercicis - Nivell bàsic
Exercici 1
a) Escriu un programa que, donat un nombre N introduït per teclat, mostre per pantalla tots els nombres de l'1 fins a N.
b) Modifica'l perquè només mostre els nombres parells.
c) Modifica'l perquè no mostre ni el 16 ni els múltiples de 3.

Exercici 2
a) Crea un programa que vaja demanant números fins que es llija un 0.
b) Afig una variable que comptabilitze quants números s'han llegit.
c) Mostra quants d'eixos han sigut positius.
d) Mostra la mitjana de tots els números llegits (sense comptar el 0 final).

Exercici 3
a) Escriu un programa que calcule i mostre el factorial d'un número N, introduït per teclat.
b) Permet que es torne a demanar el valor de N fins que siga un número positiu.
c) Afig una funcionalitat que mostre la seqüència de multiplicacions que es fan.

Exercicis - Nivell mitjà
Exercici 4
Un grup d'amics ha fet un torneig i vol enregistrar les puntuacions.

a) El programa demana el nom i puntuació de 4 jugadors i mostra qui ha aconseguit la puntuació més alta.
b) Mostra la mitjana de les puntuacions.
c) Si hi ha alguna puntuació inferior a 5, mostra "Cal millorar" per a eixos jugadors.

Exercici 5
En un centre d'atenció telefònica volen saber quants clients han valorat negativament el servei.

a) Escriu un programa que llig per teclat 10 valoracions numèriques (−5 a +5) i indique si hi ha hagut algun negatiu.
b) Modifica'l perquè també compte i mostre quants són positius, quants negatius i quants neutres (valoració de 0).
c) Afig un missatge en cas que tots siguen positius: "Excel·lent!"
d) Si algun és −5, afegir "Revisió urgent necessària".

Exercici 6
Volem controlar les despeses mensuals d'una casa.

a) El programa ha de demanar tres despeses (llum, aigua i menjar) i mostrar el total mensual.
b) S'amplia el programa per a demanar també una quarta despesa opcional (altres), i mostrar-la només si és major que 0.
c) S'amplia el programa per mostrar un resum amb percentatges de cada despesa sobre el total.

Exercicis - Nivell avançat
Exercici 7
En una biblioteca universitària volen digitalitzar el sistema de control de préstecs. Cada llibre té un codi, un títol i una data de devolució prevista. El programa ha de gestionar la llista de préstecs oberts i calcular possibles recàrrecs per retràs.

a) Demana a l'usuari el codi i el títol d'un llibre, i la data de devolució prevista (dia, mes, any). Mostra-ho tot per pantalla.
b) Afig la data d'avui i calcula si el llibre està endarrerit (data avui > data devolució). Mostra per pantalla tant si està endarrerit com si no.

Considera que un mes té 30 dies, i un any té 365 dies.
Comprova en ordre: any, mes, dia.
c) Si hi ha retràs, calcula el nombre de dies de retard i mostra un recàrrec de 0,50 € per dia.
d) Permet introduir diversos préstecs fins que l'usuari escriga "fi", i acumula el total de recàrrecs.
e) Al final, mostra un resum: nombre de llibres prestat­s, llibres endarrerits i recàrrecs totals.

NOTA:

Per a comparar un String amb la cadena "fi", usa la següent instrucció:
cadena.equals("fi")
Aquesta expressió retorna true si el valor de cadena és igual a "fi", i false en cas contrari. No és correcte usar la doble igualtat == per motius que es voran més endavant.

Exercici 8
Un departament acadèmic vol un programa que calcule la nota final d'un alumne tenint en compte exàmens, pràctiques i treballs. Cada tipus té un pes diferent: exàmens 50 %, pràctiques 30 % i treballs 20 %. A més, si algun dels tres components està per sota de 4, l'alumne suspendrà automàticament.

a) Demana les tres notes (0–10) i calcula la nota ponderada simple.
b) Afig la comprovació: si alguna nota < 4, mostra "Suspens automàtic".
c) Si no hi ha suspens automàtic, mostra "Aprovat" o "Excel·lent" si la nota final ≥ 9.
d) Permet repetir el càlcul per a diversos alumnes fins que l'usuari introduïsca "fi".
e) Al final, mostra quants alumnes han aprovat, han suspés per nota baixa i quants han obtingut Excel·lent.

Exercici 9
Una empresa de serveis vol automatitzar la facturació mensual en funció de l'ús i aplicar trams de tarifes i un IVA específic. El cost per unitat varia segons consums:

Fins a 100 unitats: 0,10 €
De 101 a 500: 0,08 €
Més de 500: 0,05 €
A més, s'aplica un IVA del 21 %.

a) Demana el consum mensual (unitats) i calcula el cost base sense IVA.
b) Aplica l'IVA i mostra el total amb IVA inclòs.
c) Afig un descompte del 5 % si el consum supera les 1000 unitats (sobre el total amb IVA).
d) Permet facturar per a diversos clients fins que l'usuari introduïsca "fi", i acumula el total facturat.
e) Mostra un resum: nombre de factures, ingressos bruts, total d'IVA i total de descomptes aplicats.



Exercici 10
Una botiga de mobles en línia necessita un programa per processar comandes i controlar l'inventari. Tenen un catàleg de productes amb codi (1, 2 o 3), nom, preu i estoc disponible. Quan l'usuari fa una comanda, cal restar unitats i calcular el total.

a) Carrega un inventari inicial de tres productes (taules, cadires i armaris) amb estoc inicial de 100 cadascun, i mostra'n la llista.
b) Permet fer una comanda: l'usuari introdueix codi de producte i quantitat; si no hi ha estoc suficient, mostra "Estoc insuficient". Si el codi no correspon a ningun producte, mostra "Codi incorrecte".
c) Permet a l'usuari fer tantes comandes com vulga, fins que el codi introduït siga 0. En cada comanda es descompten les unitats corresponents de l'inventari.
d) Si, en fer una comanda, algun producte no té suficient unitats a l'inventari, mostrarà un missatge per pantalla.
e) Després de la comanda, mostra quins productes han quedat amb estoc 0.
f) Al final escriu un informe del valor total venut i productes esgotats.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
