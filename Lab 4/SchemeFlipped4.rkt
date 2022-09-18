#lang racket
(define (makelist element size)
	size
)

(define (depth-replicate l)
	(cond
		((empty? l) '())
		(else l)
	)
)

(display (depth-replicate '(((5) 1) 2))) ;out: '(5 5 5 1 1 2)
(display "\n")