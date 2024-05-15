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


## Paso 2 .
Simulando pull request y code review.

Se agrega cuenta personal git y se invita para colaborar y poder hacer "code review".
<img width="1256" alt="Captura de pantalla 2024-05-14 a la(s) 6 09 31 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/c7f2007c-c13b-4114-a42d-b96444cc9912">
<img width="1330" alt="Captura de pantalla 2024-05-14 a la(s) 6 09 47 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/f53bc0fc-55dc-4fcb-9ceb-249ec596a242">


Una vez se tiene la cuenta y el reviewer, se agrega un comentario y se aprueba el pull request.
<img width="1495" alt="Captura de pantalla 2024-05-14 a la(s) 6 15 23 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/abd6bbce-e0d2-48bd-ac27-a4ec4a4aa9dd">

Se hace el merge del pull request y se elimina la rama feature.
<img width="1369" alt="Captura de pantalla 2024-05-14 a la(s) 6 16 20 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/82f47c19-539e-4540-941a-4462deda1c44">

<img width="1301" alt="Captura de pantalla 2024-05-14 a la(s) 6 16 29 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/534af062-502b-41ce-a8dd-5c5234739861">




