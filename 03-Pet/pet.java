public String toString(){
            String saida = "[" ;
            for(int i = 0 ;i <cadeiras.size(); i++ ){
                if( i < qtdPref);
                    saida+= "@";
                else
                    saida+= "=";
                if(cadeiras.get(i)!= null)
                    saida+=cadeiras.get(i);
            }
                return saida+"]";
            }
            private boolean inserir(int inicio,int fim , Passageiro pass){
                for(int i = inicio;i< fim;i++){
                    if(cadeiras.get(i) == null){
                        cadeiras.set(i,pass);
                        return true;
                    }
                }
                        return false;
        }
            public void inserir(Passageiro pass){
            if(pass.pref()){
                inserir(0,this.cadeiras.size(),pass);
            } else{
                if(!inserir(this.qtdPref, this.cadeiras.size(),pass));
            }

        }
            public boolean remover(String id){
            for(int i = 0 ; i < cadeiras.size(); i++){
                if(cadeiras.get(i)!= null){
                    if(cadeiras.get(i).id.equals(id)){
                        cadeiras.set(i,null);
                        return true;
                    }
                }
            }           return false;
        }
            public class Controller{
             public static void main(String[]args){
                 Topic = new Topic (0,0)
                 Scanner scanner = new Scanner(System.in);
                 while(true){
                     String line = scanner.nextline();
                     String []ui = line.split("");
                     if(ui[0].equals("init")){
                         topic = new Topic(Interger.paseInt(ui[1]), Interger.parseInt(ui[2]));
                     }else if (ui[0].equals("show")){
                         System.out.print(topic);
                     }else if (ui[0].equals("inserir")){
                         topic.inserir(new Passageiro(ui[1], Interger.paseInt(ui[2])));
                     }else if (ui[0].equals("remover")){
                         topic.remover(ui[i]);
                     }else {
                         System.out.println("fail:comando invalido")
                     }
                 }

             }
            }
            }
        }
