(define (myReverse list)
  (cond
   ((null? list) '())
   (else (append (myReverse (cdr list)) (cons (car list) '())))
   )
)

(define (main)
  (display (myReverse '()))
  (display "\n")
  (display (myReverse '(1 2 3)))
  (display "\n")
  (display (myReverse '('(1 2) '(3 4))))
)

(main)
(exit)
