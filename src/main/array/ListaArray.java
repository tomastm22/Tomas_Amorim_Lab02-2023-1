package array;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {

    }

    @Override
    public boolean buscaElemento(int valor) {

        if(this.array != null) {

            for(int n : this.array) {

                if(n == valor) {

                    return true;
                }
            }
        }
        return false;

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'buscaElemento'");
    }

    @Override
    public int buscaIndice(int valor) {

        return this.array[valor];

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'buscaIndice'");
    }

    @Override
    public int minimo() {

        int valorMinimo = this.array[0];

        for(int valor : this.array) {

            if(valor < valorMinimo) {

                valorMinimo = valor;
            }
        }
        return valorMinimo; 

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    @Override
    public int maximo() {

        int valorMaximo = this.array[0];

        for(int valor : this.array) {

            if(valor > valorMaximo) {

                valorMaximo = valor;

            }
        }
        return valorMaximo; 

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'maximo'");
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {

        if(this.array != null) {

            int[] arrayL = new int[this.array.length + 1];

            for(int i = 0; i < this.array.length - 1; i++) {

                arrayL[i] = this.array[i];

            }
            
            arrayL[indice_fim + 1] = valor;

            this.array = arrayL;

            this.indice_fim = this.array.length - 1;
        }
        
        else {

            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;

        }

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'insereElemento'");
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        
        if (this.array != null) {

            int[] arrayL = new int[this.array.length + 1];
            
            for (int i = 0; i < this.array.length; i++) {

                if (i < buscaIndice) {

                    arrayL[i] = this.array[i];
                    
                }
                
                else if(i == buscaIndice) {
                    
                    arrayL[i] = valor;
                    
                    if (i < indice_fim) {
                        
                        arrayL[i + 1] = this.array[i];

                    }
                }

                else if(i > buscaIndice) {

                    if(i < indice_fim) {

                        arrayL[i + 1] = this.array[i];
                    }
                }
            }

            this.array = arrayL;
            this.indice_fim = this.array.length - 1;
        }
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }

    @Override
    public void insereInicio(int valor) {

        if (this.array != null) {

            int[] arrayL = new int[this.array.length + 1];

            for (int i = 0; i < this.array.length; i++) {

                arrayL[i + 1] = this.array[i];

            }
            
            arrayL[0] = valor;

            this.array = arrayL;

            this.indice_fim = this.array.length - 1;
        }

        else {

            this.array = new int[1];

            this.array[0] = valor;

            this.indice_fim = 0;

        }
    }

    @Override
    public void insereFim(int valor) {
        
        if (this.array != null) {

            int[] arrayL = new int[this.array.length + 1];

            for (int i = 0; i < this.array.length; i++) {

                arrayL[i] = this.array[i];

            }

            arrayL[indice_fim + 1] = valor;

            this.array = arrayL;

            this.indice_fim = this.array.length - 1;
        }

        else {

            this.array = new int[1];

            this.array[0] = valor;

            this.indice_fim = 0;
        }
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    @Override
    public void remove(int valor) {
        
        int[] arrayL = new int[this.array.length - 1];

        for (int i = 0; i < indice_fim; i++) {

            if (this.array[i] != valor) {

                arrayL[i] = this.array[i]; 

            }

            else {

                if (i + 1 < arrayL.length) {

                    arrayL[i] = this.array[i + 1];

                }
            }    
        }
        
        this.array = arrayL;

        indice_fim = arrayL.length - 1;

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        
        int[] arrayL = new int[this.array.length - 1];

        for (int i = 0; i < indice_fim; i++) {

            if (i < indice) {

                arrayL[i] = this.array[i];  

            }

            else if (i >= indice) {

                if (i + 1 < arrayL.length) {

                    arrayL[i] = this.array[i + 1];
                }
            }   
        }
        this.array = arrayL;
        indice_fim = arrayL.length - 1;
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        
        if (this.array != null) {
            
            int[] arrayL = new int[this.array.length - 1];

            for (int i = 1; i < indice_fim; i++) {

                arrayL[i - 1] = this.array[i];

            }

            this.array = arrayL;

            this.indice_fim = this.array.length - 1;
        }
        
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {

        if (this.array != null) {

            int[] arrayL = new int[this.array.length - 1];

            for (int i = 0; i < indice_fim; i++) {

                arrayL[i] = this.array[i];

            }

            this.array = arrayL;

            indice_fim = indice_fim -1;
        }
    }

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    

