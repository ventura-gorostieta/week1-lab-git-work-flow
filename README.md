# week1-lab-git-work-flow
Laboratorio de semana 1, git, mejores prácticas y work flows. Curso iron hack.

Paso 1
Se crea el repositorio git con la configuración default.

<img width="865" alt="Captura de pantalla 2024-05-14 a la(s) 5 53 30 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/1b2430e1-4036-4dbf-8023-fc6b7491880b">

Se clona el repositorio:
<img width="958" alt="Captura de pantalla 2024-05-14 a la(s) 5 53 48 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/0fd17fbf-d77b-40ae-8b8b-7625288afdf3">

<img width="973" alt="Captura de pantalla 2024-05-14 a la(s) 5 54 44 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/d47b32c7-8a1a-4833-a19c-40ec6e86bd70">

Una vez clonado, se crear los branch para simular un trabajo de proyecto donde se opta por usar GitFlow. ¿Por qué?, porque para proyectos grandes, donde no siempre todos lso feature que estan en la rama develop, pasan a qa, stage y por consecuente a prod, este nos permite mantener confinadas las feature que no deben llegar a prod, auxiliando con cherry-pick y el rebase.
Cabe destacar que para que esta estrategia de branch sea funciona, requiere administración y conocer tren de liberaciones de los feature en las ramas.
<img width="644" alt="Captura de pantalla 2024-05-14 a la(s) 5 59 30 p m" src="https://github.com/ventura-gorostieta/week1-lab-git-work-flow/assets/97199485/47df09b2-b5ea-4085-a0a6-88e3f8101fc5">
