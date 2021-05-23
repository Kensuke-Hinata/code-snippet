module plfa.part1.Naturals where

data N : Set where
    zero : N
    suc : N -> N

_+_ : N -> N -> N
zero + n = n
(suc m) + n = suc (m + n)

_*_ : N -> N -> N
zero * n = zero
(suc m) * n = n + (m * n)

_^_ : N -> N -> N
m ^ zero = (suc zero)
m ^ (suc n) = m * (m ^ n)
