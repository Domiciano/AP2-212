## Realice un pull request para efectuar su entrega

### Paso 1
Hacer un fork de este repositorio. El fork se hace a través de la página web

### Paso 2
Clone su fork: <br>
```
git clone LinkDelFork
```


### Paso 3
Cree un remoto llamado upstream cuyo enlace sea el del repositorio original: <br>
```
git remote add upstream https://github.com/Domiciano/AP2-212
```

### Paso 4
Cree una rama de trabajo, por ejemplo:
```
git checkout -b seguimientoX
```

### Paso 5
Ponga su entrega en su carpeta correspondiente, con su nombre. Arrastre el proyecto a su carpeta

### Paso 6
Haga un push. Para esto realice:
```
git add .
git commit -m "Entrega"
git push origin seguimientoX
```

### Paso 7
Haga un pull request. Esto se hace en la página. El pull debe ser
```
master <- seguimientoX
```

