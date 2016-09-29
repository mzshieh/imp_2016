def f(n):
    if n == 0:
        print('move 1 step')
        print('rorate 1 degree')
    else:
        for _ in range(n):
            f(n-1)
            
f(3)