#lang racket
(define (true-for-all-pairs? proc ls)
    (cond
        ((pair? ls) (proc (car ls) (caar ls)))
        (else (true-for-all-pairs? proc (cdr ls)))
    )
)

(display (true-for-all-pairs? equal? '(#\a #\b #\c #\c #\d))) ; #f
(newline)
(display (true-for-all-pairs? equal? '(#\a #\a #\a #\a #\a))) ; #t
(newline)
(display (true-for-all-pairs? < '(20 16 5 8 6)))    ; #f
(newline)
(display (true-for-all-pairs? < '(3 7 19 22 43)))   ; #t