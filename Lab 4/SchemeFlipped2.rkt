#lang racket
(define (deeplistadder list1 list2)
	(map add list1 list2)
)

(define (add x y)
	(if (list? x)
		(map add x y)
		(+ x y)
	)
)

(define (main)
	(display (deeplistadder '((1 2 (3 4)) 4) '((1 2 (3 4)) 6))) ; '(2 4 '(6 8) 10)
	(newline)
)

(main)