#lang racket
(define (true-for-all-pairs? proc ls)

  (cond
    ((empty? ls) #t)
    ((proc (car ls) (true-for-all-pairs? proc (cdr ls))))
    ;((proc (cons(car ls) (cadr ls))))
    (else #f)
    )
  )

(display (true-for-all-pairs? equal? '(a b c c d)))
(display (true-for-all-pairs? equal? '(a a a a a)))