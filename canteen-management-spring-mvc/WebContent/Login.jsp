<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
                integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
                crossorigin="anonymous">
</head>

<body>
        <div class="card text-center "
                style=" height:100%;background-image: linear-gradient(160deg,orange,white,green);font-family: 'Times New Roman', Times, serif; font-size: 23px;">
               
               <form>
                <div class="card-body mt-5" style=" height:100% ">

                        <div class="row mt-5" style="justify-content: center;align-content: center " >
                                <label class=" col-2;"  >UserName :</label>
                                <input name="username" type="text" class="form-control col-3" required
                                        style="box-shadow: 1px 2px 3px 4px #4cc912;" id="exampleInputEmail1"
                                        aria-describedby="emailHelp" placeholder="username" required autocomplete="on"
                                        autofocus>
                        </div>
                        <div class="row mt-5" style="justify-content: center;align-content: center ">
                                <label class=" col-2 font-weight-bolder text-dark" for="exampleInputEmail1">Password
                                        :</label>
                                <input name="password" type="password" class="form-control col-3 "  required
                                        style="box-shadow: 1px 2px 3px 4px #4cc912;" id="exampleInputEmail1"
                                        aria-describedby="emailHelp" placeholder="password" required 
                                       >
                        </div>

                        <div class="row mt-5" style="justify-content: center;align-content: center ">
                                <div class="col-5"><button type="submit" formaction=" login.htm"  class="btn btn-success col-2" style="justify-content: left  ;;" >Login</button></div>
                                <div class="col-4">
                                        
                                       
                                </div>
                                <div class="col-3"></div>
                        </div>


                </div>
              </form>
        </div>
</body>

</html>