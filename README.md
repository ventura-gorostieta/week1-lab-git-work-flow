# week1-lab-git-work-flow
Laboratorio de semana 1, git, mejores prácticas y work flows. Curso iron hack.

## Paso 1
Se crea el repositorio git con la configuración default.

<img width="865" alt="Captura de pantalla 2024-05-14 a la(s) 5 53 30 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/1b2430e1-4036-4dbf-8023-fc6b7491880b">

Se clona el repositorio:
<img width="958" alt="Captura de pantalla 2024-05-14 a la(s) 5 53 48 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/0fd17fbf-d77b-40ae-8b8b-7625288afdf3">

<img width="973" alt="Captura de pantalla 2024-05-14 a la(s) 5 54 44 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/d47b32c7-8a1a-4833-a19c-40ec6e86bd70">

Una vez clonado, se crear los branch para simular un trabajo de proyecto donde se opta por usar GitFlow. ¿Por qué?, porque para proyectos grandes, donde no siempre todos lso feature que estan en la rama develop, pasan a qa, stage y por consecuente a prod, este nos permite mantener confinadas las feature que no deben llegar a prod, auxiliando con cherry-pick y el rebase.
Cabe destacar que para que esta estrategia de branch sea funciona, requiere administración y conocer tren de liberaciones de los feature en las ramas.
<img width="644" alt="Captura de pantalla 2024-05-14 a la(s) 5 59 30 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/47df09b2-b5ea-4085-a0a6-88e3f8101fc5">

## Paso 2
Resolver conflictos y resolverlos.
Nos situamos en la rama feature/new-feature-1, la cual se quedo atras con respecto a develop, por lo tanto se hace un rebase para jalar cambios antes de proceder con la simulación de conflictos:

Se crea una rama donde se modificará una clase java de ejemplo, dicha será modificada con cuenta alterna para simular 2 devs.
Al momento de hace<img width="1088" alt="Captura de pantalla 2024-05-14 a la(s) 6 44 06 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/5bc6a2c1-8f70-448a-9249-6c7c96b06e3f">
r el pulll y rebase, se hace merge automatico con los cambios:
![Uploading Captura de pantalla 2024-05-14 a la(s) 6.44.06 p.m..png…]()
![Uploading Captura de pantalla 2024-05-14 a la(s) 6.44.28 p.m..png…]()

<img width="766" alt="Captura de pantalla 2024-05-14 a la(s) 6 45 46 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/baa64c0f-0499-46f2-a319-bfe1a37aa96a">

Finalmente se hicieron varios cambios a la clase FibonacciCalculatorDemo de tal manera  de poder forzar un conflicto al momento de hacer merge hacía develop.
<img width="1394" alt="Captura de pantalla 2024-05-14 a la(s) 7 05 17 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/858ec540-ad74-4b2b-b230-7775c62c02ad">

Conflicto:
<img width="1299" alt="Captura de pantalla 2024-05-14 a la(s) 7 05 44 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/d13857b6-6a9d-40f7-aa95-413b052da631">
<img width="1353" alt="Captura de pantalla 2024-05-14 a la(s) 7 05 57 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/628427dd-701b-4724-803c-10af54a5ffe6">

Hago rebase de develop para poder resolver conflicto:
<img width="738" alt="Captura de pantalla 2024-05-14 a la(s) 7 08 33 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/128aa0b9-7a62-4555-9bd4-be0db6008d23">

<img width="843" alt="Captura de pantalla 2024-05-14 a la(s) 7 09 13 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/38793dd1-e71d-4170-84e0-be6ff59438cb">

<img width="474" alt="Captura de pantalla 2024-05-14 a la(s) 7 09 25 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/446c97e5-fe0b-4c20-b936-135a01be0d59">


Se resuleven conflictos y se hace push para actualizar el repositorio del que se desea fusionar a develop.
<img width="762" alt="Captura de pantalla 2024-05-14 a la(s) 7 09 34 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/64046785-4b55-4868-95ed-2db503576f4e">
<img width="1207" alt="Captura de pantalla 2024-05-14 a la(s) 7 09 40 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/24bfa8c9-73ac-4b11-b46c-923385039a05">

<img width="1203" alt="Captura de pantalla 2024-05-14 a la(s) 7 10 01 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/2a9d34bb-c697-49a5-acae-3d6ea94ce316">

Se suben los cambios al repositorio feature:
<img width="1069" alt="Captura de pantalla 2024-05-14 a la(s) 7 14 01 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/2ace3f4b-695f-4a01-86f0-da5317eb7b91">

Y de estya manera se pueden resolver conflictos utilizando rebase y merge.

## Paso 3 .
Simulando pull request y code review.

Se agrega cuenta personal git y se invita para colaborar y poder hacer "code review".
<img width="1256" alt="Captura de pantalla 2024-05-14 a la(s) 6 09 31 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/c7f2007c-c13b-4114-a42d-b96444cc9912">
<img width="1330" alt="Captura de pantalla 2024-05-14 a la(s) 6 09 47 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/f53bc0fc-55dc-4fcb-9ceb-249ec596a242">


Una vez se tiene la cuenta y el reviewer, se agrega un comentario y se aprueba el pull request.
<img width="1495" alt="Captura de pantalla 2024-05-14 a la(s) 6 15 23 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/abd6bbce-e0d2-48bd-ac27-a4ec4a4aa9dd">

Se hace el merge del pull request y se elimina la rama feature.
<img width="1369" alt="Captura de pantalla 2024-05-14 a la(s) 6 16 20 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/82f47c19-539e-4540-941a-4462deda1c44">

<img width="1301" alt="Captura de pantalla 2024-05-14 a la(s) 6 16 29 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/534af062-502b-41ce-a8dd-5c5234739861">




