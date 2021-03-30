Module VbModule

        function factorial(n As Integer) As Integer
                If n = 0 Then
                    return 1
                else
                    return n*factorial(n-1)
                end if
        End Function

        Sub Main()
                console.writeline("Ingrese el n para calcular el factorial")
                Dim n as Integer 
                n = console.readline()
                factorial(n)                
        end sub

        sub factorialIterativo(n AS Integer)                
                Dim acum as Integer = 1  
                if n = 0 OR n = 1 Then
                      acum = 1
                else                          
                        for i = 2 to n
                                acum *= i
                        Next
                end if
                console.writeline("El factorial es" & acum) 
        end sub

End Module