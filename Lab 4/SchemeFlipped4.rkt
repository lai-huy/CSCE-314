#lang racket
(define (depth-replicate list1)
  (cond
    ((null? list1) '())
     (else (cons car list1) depth-replicate(cdr list1))
    )
  )

(display (depth-replicate '( ( ( 5 ) 1 )  2 ) ) )
(display "\n")